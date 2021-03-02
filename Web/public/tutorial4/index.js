var app = new Vue({
    el: '#app-4',
    data: {
        isChecked: true,
        header: '튜토리얼4 - v-show',
        message: 'Vue어플리케이션 프로젝트입니다',
        message1: '안녕하세요',
        text1: '반가워요',
        message2: 'ㅎㅇ',
        text2: 'ㅎㅇㅇ',
        message3: 'hi',
        text3: 'hello'
    },
    methods:{
        onClickCheckButton:function(e){
            this.isChecked = e.target.checked
        }
    }
});