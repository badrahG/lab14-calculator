# Lab14: Maven Calculator Project

Maven-д суурилсан Java тооцоолуурын төсөл Git workflow болон GitHub Actions CI/CD-тэй.

##  Тодорхойлолт

Энэ төсөл нь:
-  Maven build system ашигладаг
-  JUnit 5-аар тест хийдэг
-  Checkstyle-аар код загварыг шалгадаг
-  JaCoCo-оор 100% branch coverage хийдэг
- GitHub Actions-аар автомат CI/CD ажиллуулдаг

##  Хэрхэн Ажиллуулах

### Шаардлага
- Java 17 эсвэл түүнээс дээш
- Maven 3.6+

### Төслийг Эмхтгэх

```bash
mvn clean install
```

### Тест Ажиллуулах

```bash
mvn test
```

### Checkstyle Шалгах

```bash
mvn checkstyle:check
```

### Code Coverage Тайлан Үүсгэх

```bash
mvn jacoco:report
```

Тайланг `target/site/jacoco/index.html` файлаас харна уу.

### Бүх Шалгалт Нэгэн Зэрэг

```bash
mvn clean verify
```

##  Төслийн Бүтэц

```
lab14-calculator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── labxx/sict/must/edu/mn/
│   │           ├── Addition.java
│   │           ├── Subtraction.java
│   │           ├── Multiplication.java
│   │           └── Division.java
│   └── test/
│       └── java/
│           └── labxx/sict/must/edu/mn/
│               ├── AdditionTest.java
│               ├── SubtractionTest.java
│               ├── MultiplicationTest.java
│               └── DivisionTest.java
├── .github/
│   └── workflows/
│       └── ci.yml
├── pom.xml
├── checkstyle.xml
└── README.md
```

##  Git Workflow

- `main` - Үндсэн салбар (хамгаалагдсан)
- `develop` - Хөгжүүлэлтийн салбар
- `feature/*` - Онцлогийн салбарууд
- `release/*` - Хувилбарын салбарууд
- `hotfix/*` - Түргэн засварын салбарууд

## Хувилбарууд

- **v1.0.0** - Анхны хувилбар
- **v1.0.1** - Hotfix хувилбар
