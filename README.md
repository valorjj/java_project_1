# java_groupProject
ezen_group_project

- 이번 팀 프로젝트에 선언된 객체들의 관계도입니다. 
- 카페에 있는 키오스크를 간단하게 구현해보는 것이 목표입니다.
- 관리자 기기에 등록한 admin 항목, 고객이 주문한 데이터를 담는 customer 항목

![](https://i.imgur.com/eh0Wvfp.jpg)

![](https://i.imgur.com/farfkQ1.png)

![](https://i.imgur.com/3ChaSfs.png)


### dbdiagram.io 소개
> https://velog.io/@wildmental/%EA%B7%B8%EB%A6%AC%EA%B8%B0-%EA%B7%80%EC%B0%AE%EC%9D%80-ERD-DBdiagram.io%EB%A1%9C-5%EB%B6%84%EB%A7%8C%EC%97%90-%EC%99%84%EC%84%B1%ED%95%98%EA%B8%B0

### ERD 에 관한 글 
> https://velog.io/@jch9537/DATABASE-PK-FK
> https://gngsn.tistory.com/48#recentComments

Entities Relationship Diagram 은 `개체(자바 프로그래밍에서 객체라고 보겠습니다)` 관의 `관계` 를 중점적으로 나타내는 다이어그램입니다. 
간단한 예시는 다음과 같습니다. 

![](https://i.imgur.com/VNJgZrO.png)


![](https://i.imgur.com/92nRx4u.png)

![exmaple](https://i.imgur.com/U2sHr09.png)

### Markdown 언어 작성법

https://velog.io/@yuuuye/velog-%EB%A7%88%ED%81%AC%EB%8B%A4%EC%9A%B4MarkDown-%EC%9E%91%EC%84%B1%EB%B2%95


### 시간을 잡아먹었던 부분

프로젝트 맨 처음에 큰 그림을 그리지 않고 시작하는 바람에 변수명을 구분이 잘 안되게 지어서 오류가 많이 났습니다. 
admin / customer 관련한 변수, 클래스, 메소드 등을 다른 사람이 봐도 한눈에 알 수 있도록 명확히 구분지었어야 했는데 그냥 대충지었더니 나중에 바꾸느라 시간을 꽤 잡아먹었습니다. 

그리고 처음엔 단순히 배열(Array) 만 사용했다가, 코드가 길어지기도 하고 객체 지향의 개념을 최대한 더 살려보고자 ArrayList 를 사용했습니다. 
class 를 이용해서 클래스, 메소드들을 잘게 쪼개서 코드를 작성하는 것이 익숙하지 않아서 클래스 내의 필드 값을 지정하고, 다시 호출하는 것조차 쉽지 않았습니다. 거기에 초반에 변수명까지 분간이 잘 되지 않는 상황이었기 때문에 빨간줄 에러가 아니더라도 논리오류가 많이 나서 ERD 를 그려보면서 오류를 바로 잡았습니다. 


### 추후 수정해야 할 부분

(1) 무분별한 static 의 사용으로 객체 지향의 개념이 모호해졌습니다. 프로그램 실행 전반에 걸쳐서 메모리를 써야하는 필수적인 걸 제외하고는 static 을 빼고, 접근제한자를 사용해서 직접적인 필드와 메소드 노출을 막아야 한다고 생각합니다. 

> ※ Static 사용의 단점
1. 클래스가 많아지고 코드가 복잡해지면 static의 현재 상태를 추론하기가 힘들어짐
2. 각 클래스의 독립성을 추구하는 객체지향 방식의 이념에서 벗어남 (객체간 의존도를 높임)
3. 캡슐화를 통해 필드의 직접 노출을 막는 객체지향 방식의 이념에서 벗어남
4. 프로그램 종료시까지 메모리를 점유하고 있어 메모리 낭비 발생 가능


(2) 예외처리를 아직 배우지 않아서 int 입력을 받을 때, String 타입을 입력하면 오류가 발생하는 걸 막는 등의 예외 처리를 해줘야한다고 생각합니다. 나중에 예외처리를 배운다면 다시 돌아와서 수정할 것 입니다. 

### 읽어보면 좋을 자료 

> 자바가 C보다 상대적으로 느린 이유 - 메모리 구조에 관한 이해 

(https://codevang.tistory.com/83?category=827598)

(https://codevang.tistory.com/84)

> 자바 static 에 관한 이해 

(https://vaert.tistory.com/101)

> stack 과 heap 메모리 

(https://nowonbun.tistory.com/303)

---
### 클래스, 객체, 그리고 인스턴스

> 클래스
- 객체를 만드는 틀 , 객체를 만들기위한 설계도
- 클래스를 만들때는 class 클래스명{  } 으로 만들 수 있습니다.

> 객체  (객체란 속성(상태)과 기능(동작)을 가진 덩어리)
- 객체는 속성과 기능의 집합이며, 속성과 기능을 객체의 멤버라고 한다.
- 속성(Property) : 멤버변수(member variable), 특성(attribute), 필드(field), 상태(state)
- 기능(function) : 메서드(method), 행위(behavior), 함수(function)

> 인스턴스 (생성된 객체, 어떤 클래스에 속하는 각각의 객체)
- 객체를 생성하여 JVM(자바 가상 머신)이 관리하는 메모리에 적재된 것을 의미
- 어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라고 합니다.
- 클래스로부터 객체를 만드는 과정을 인스턴스화 라고 한다.
- 특징 : 클래스가 가지고 있는 메소드(method)를 모두 상속 받는다. 

---
> 객체와 인스턴스
- 객체는 인스턴스를 포함하는 일반적인 의미
- 인스턴스화 : 클래스로부터 인스턴스를 생성하는 것
- 클래스 -> 인스턴스화 -> 인스턴스(객체)

객체 : 모든 인스턴스를 대표하는 포괄적 의미

인스턴스 : "어떤 클래스"로부터 만들어진 것인지를 강조하는 구체적 의미

( 일단, 인스턴스 ⊂ 객체라고 하자)

![객체와인스턴스](https://i.imgur.com/I6qnRqf.jpg)



클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화(instantiate)라고 한다.

어떤 클래스로부터 만들어진 객체를 그 클래스의 인스턴스(instance)라고 한다.

출처 : https://whatisthenext.tistory.com/36

---

### 자바는 왜 Stack / Heap 메모리 영역을 나눠서 취급하는 걸까? 그리고 heap 영역에 있는 값을 무슨 수로 읽어오는 걸까?
> stakc/heap 구분은 C/C++ 에서 온 개념이다. 




