$(function() { //페이지가 로딩될 떄
   showList();
})

var replyUl = $(".chat"); //read.jsp안에 클래스가 챗이라고 되어있는 것을 찾는다.
function showList() {
   replyService.getList({ bbsno: bbsno, sno: sno, eno: eno }, //여기까지 파람,여기서 겟리스트는 이름, {}안에 이름:실제값
      function(list) { //겟리스트 호출해서 콜백함수가 리스트가 됨
         var str = "";
         if (list == null || list.length == 0) {
            return;// 밑으로 안 내리고 여기서 끝낸다
         }

         for (var i = 0, len = list.length || 0; i < len; i++) {
            str += "<li class='list-group-item' data-rnum='" + list[i].rnum + "'>";
            str += "<div><div class='header'><strong class='primary-font'>" + list[i].id + "</strong>";
            str += "<small class='pull-right text-muted'>" + list[i].regdat + "</small></div>";
            str += replaceAll(list[i].content, '\n', '<br>') + "</div></li>";
         }

         replyUl.html(str);//제이쿼리 함수. 이너html

         showReplyPage();
      }//요기까지가 콜백, error는 생략
   );//getList end
}//showList end

function replaceAll(str, searchStr, replaceStr) {//위의 for문 4번째 줄
   return str.split(searchStr).join(replaceStr);
}

var replyPageFooter = $(".panel-footer");//read.jsp안에 클래스가 패널푸터라고 되어있는 것을 찾는다.

var param = "nPage=" + nPage;
param += "&nowPage=" + nowPage;
param += "&bbsno=" + bbsno;
param += "&col=" + colx;
param += "&word=" + wordx;

function showReplyPage() { //5줄 위에 var param
   replyService.getPage(param,
      function(paging) {
         console.log(paging);
         var str = "<div><small class='test-muted'>" + paging + "</small></div>";

         replyPageFooter.html(str);
      })
}//showReplyPage end

var modal = $(".modal");
var modalInputContent = modal.find("textarea[name='content']");
var modalModBtn = $("#modalModBtn");
var modalRemoveBtn = $("#modalRemoveBtn");
var modalRegisterBtn = $("#modalRegisterBtn");

$("#modalCloseBtn").on("click",function(e){
   modal.modal('hide');
});

$("#addReplyBtn").on("click",function(e){
   if(session_id == ""){ //login이 안되었다면
   		if(confirm('로그인해야 댓글을 쓸 수 있습니다.')){
   			var url = "../member/login";
   			url += "?col=" + colx;
   			url += "&word=" + wordx;
   			url += "&nowPage=" + nowPage;
   			url += "&nPage=" + nPage;
   			url += "&bbsno=" + bbsno;
   			url += "&rurl=../bbs/read";
   			location.href = url;   			
   		}// confirm end
   }else{
   		modalInputContent.val("");
   		modal.find("button[id != 'modalCloseBtn']").hide()
   		modalRegisterBtn.show();
   
   		$(".modal").modal("show");
   }//session_id end
});//addReplyBtn on end

modalRegisterBtn.on("click", function(e){
   if(modalInputContent.val()==''){
      alert("댓글을 입력하세요");
      return;
   }
   
   var reply={
      content:modalInputContent.val(),
      id:session_id,
      bbsno:bbsno
   };
   
   //바로 위에 있는 리플라이
   replyService.add(reply, function(result){
      modal.find("input").val("");
      modal.modal("hide");
      
      showList();
   })//add end
})//button click end

$(".chat").on("click", "li", function(e){
	var rnum = $(this).data("rnum");
	replyService.get(rnum,function(reply){
		modalInputContent.val(reply.content);
		modal.data("rnum",reply.rnum);
		modal.find("button[id != 'modalCloseBtn']").hide();
		
		if(session_id == reply.id){
			modalModBtn.show();
			modalRemoveBtn.show();
		}
		modal.modal("show");
	})// get end
})// chat click end

modalModBtn.on("click", function(e){
	var reply = {
		rnum : modal.data("rnum"),
		content : modalInputContent.val()
	};
	
	replyService.update(reply, function(result){
		modal.modal("hide");
		showList();
	});// update end
});// ModBtn end

modalRemoveBtn.on("click", function(e){
	var rnum = modal.data("rnum");
	
	replyService.remove(rnum,function(result){
		modal.modal("hide");
		showList();
	});// remove end
});// RemoveBtn end








