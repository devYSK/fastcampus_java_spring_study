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
