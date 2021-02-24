var app = new Vue({
    el: '#app-8',
    data: {
        value: 0,
        label1: '꽃',
        label2: '음식',
        label3: '국가',
        label4: '색',
        header: '튜토리얼8 - v-for',
        message: 'v-for는 배열이나 리스트를 연속해서 보여주는 렌더링 지시자입니다.',
        message1: '카테고리를 선택하세요',
        flowerList : ['장미', '개나리', '진달레'],
        foodList : ['라면','칼국수','볶음밥'],
        nationList : ['한국', '미국', '일본', '캐나다'],
        colorList : ['빨간색', '주황색', '초록색','파란색']
    }
});
