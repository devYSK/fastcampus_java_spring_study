# 스프링 부트 정리

* Spring Boot는 단순히 실행되며, 프로덕션 제품 수준의 스프링 기반 어플리케이션을 쉽게 만들 수 있다.
* Spring Boot App에서는 Spring 구성이 거의 필요하지 않다.
* Spring Boot java -jar로 실행하는 Java App을 만들 수 있다

* Spring 개발에 대해 빠르고, 광범위하게 적용할 수 있는 환경 
* 기본값 설정이 있지만, 설정을 바꿀 수 있다.
* 대규모 프로젝트에는 공통적인 비 기능 제공
* XML 구성 요구사항이 전혀 없음.


* ## Build Tool
  * Maven
  * Gradle


# GET API

* ![](img/2021-06-17-17-08-02.png)


## Get 관련 어노테이션

* @GetMapping - Get Resource 설정
* @RequestParam - URL Query Param Parsing
* @PathVariable - URL Path Variable Parsing
* Object - Query Param Object로 Parsing
* @RestController - RestApi 컨트롤러 설정
* @RequestMapping - 리소스를 설정 (Method로 구분 가능)


# POST API

* @PostMapping - Post Resource 설정
* @JsonProperty - json naming
* @JsonNaming - class json naming


# PUT API

* @PutMapping - Put Resource 설정
* @RequestBody - Request Body 부분 Parsing
* @PathVariable - URL Path Variable Parsing 

# DELETE API

* @DeleteMapping - Delete Resource 설정


# Response 응답 내려주기

* String - 일반 text type 응답
* Object - 자동으로 Json 변환되어 응답 상태값은 항상 200 OK
* ReponseEntity - Body 내용을 Object로 설정 상황에 따라서 Http status code 설정
* @ResponseBody - RestController가 아닌곳(Controller)에서 Json 응답을 내릴 때


# 스프링 조금 더 들여다보기 - 스프링 핵심

* 스프링 프레임워크의 구성은 20여가지로 구성.  
* 이러한 모듈들은 스프링의 핵심기능 (DI, AOP, etc)를 제공해주며, 필요한 모듈만 선택하여 사용 가능.  
  
* 현재 단일 아키텍처(모놀리스) 마이크로 서비스 아키텍처로 변환중. 여기에 맞춰 스프링도 진화하고 있는 상태.  
  
* 여러가지 모듈 중 단연 스프링 부트, 스프링 클라우드, 스프링 데이터, 스프링 배치, 스프링 시큐리티에 중점을 둔다.  

* 스프링의 과제는 '테스트의 용이성','느슨한 결합'에 중점을 두고 개발
* IOC의 등장
  * 스프링이 다른 프레임워크와 가장 큰 차이점이 IOC를 통한 개발 진행

* AOP
  * AOP를 사용하여 로깅, 트랙잭션 관리, 시큐리티 적용 등 AspectJ와 같이 완벽하게 구현된 AOP와 통합하여 사용 가능 하다. 

![](img/2021-06-18-21-24-22.png)

