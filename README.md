# Randoop Test Generation and Coverage Report

### **1. Generate Test Cases**
```bash
java -cp "target/classes;lib/randoop-all-4.3.4.jar" randoop.main.Main gentests --testclass=Stack --junit-output-dir=test --junit-package-name=randoop
```

### **2. Compile the main code**
```
mvn compile
```

### **3. Command to run test cases**
```
mvn test
```

### **4. Generate Report**
```
mvn jacoco:report
```

### **5. View Report**
```
target/site/jacoco/index.html
```
