### 기본 Directory 구조

현재 커밋된 소스는 일반적인 Maven Web Project 구조입니다.
개발 소스는 src/main 밑에 존재를 하구요.
하위로 크게 세개의 Directory를 가집니다.

- **java** (Java sources)
- **resources** (Property files)
- **webapp** (Web Document Root)


### Java Packages

Base Package는 com.mobigen.iris 이고 하위로 계층(레이어) 단위로 Package를 나누고,
각 Package 하위에 메뉴별 파일들이 존재한다.
그리고 화면단위에 포함되지 않는 공통적인 모듈 및 프로그램들(예 : Util, Cont) 은 common Package에 구현합니다.

- **java**
  - **com**
    - **mobigen**
      - **iris**
        - **common**
          - **config**
            * AppConfig.java
          - **security**
            * security.java
          - **utils**
            * StringUtil.java
          - **.....**
        - **controller**
          * SampleController.java
          * SampleExtController.java
        - **service** 
          - **impl**
              * SampleServiceImpl.java
              * SampleServiceExtImpl.java
          * SampleService.java
          * SampleServiceExt.java
        - **dao**
          * SampleDao.java
          * SampleExtDao.java
        - **domain** 
          * Sample.java
          * SampleExt.java
- **resources**
  - **message**
    * message.properties
  - **property**
  	- db.properties
  - **sqlMap**
    - **mappers**
       * SampleDao.xml

