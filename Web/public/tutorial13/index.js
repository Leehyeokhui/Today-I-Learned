var app = new Vue({
    el: '#app-13',
    data: {
        header: '튜토리얼13 - v-cloak(이혁희)',
        messages: ['v-cloak은 페이지를 열 때 순간적으로 {{__}}가 표시되는 것을 방지하는 지시자입니다.',
                    'v-cloak속성이 지정한 요소는 CSS display:none이 적용됩니다.',
                    'Vue렌더링이 끝날 때 자동적으로 display:none가 해제됩니다.'],
        message:'브라우저 새로고침 버튼이나 키보드 F5키를 눌러주세요',
        message2:'안녕하세요'
    }
});
