var app = new Vue({
    el: '#app-5',
    data: {
        isChecked: true,
        header: '튜토리얼5 - v-if',
        message1: 'v-if는 렌더틸을 제어하는 지시자입니다.',
        message2: 'v-if가 true인 경우 렌더링이 되고 false인 경우 렌더링이 되지 않습니다.',
        text1:'이혁희'
    },
    methods:{
        onClickCheckButton:function(e){
            this.isChecked = e.target.checked
        }
    }
});
