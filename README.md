<h1 align="center">🚀 Java Code Quality CI Pipeline</h1>

<p align="center">
  <a href="https://sonarcloud.io/dashboard?id=mahek320_java-ci-code-quality">
    <img src="https://sonarcloud.io/api/project_badges/measure?project=mahek320_java-ci-code-quality&metric=alert_status" alt="Quality Gate Status">
  </a>
  <a href="https://sonarcloud.io/dashboard?id=mahek320_java-ci-code-quality">
    <img src="https://sonarcloud.io/api/project_badges/measure?project=mahek320_java-ci-code-quality&metric=coverage" alt="Coverage">
  </a>
</p>

---

> A GitHub Actions-based CI pipeline for Java projects that enforces code quality, security scanning, formatting, and coverage reporting — all automated in a production-ready setup.


## 🛠️ Features

- ✅ Code Linting with `Checkstyle`  
- 🎨 Code Formatting Check using `Spotless`  
- 🐞 Static Code Analysis with `SpotBugs`  
- 🔐 Security Scanning via `OWASP Dependency-Check`  
- 🧪 Unit Testing & Coverage with `JaCoCo`  
- 📊 Code Quality Analysis using `SonarCloud`  
- 📧 Automated Email Notifications with Reports  
- ☁️ Upload Reports as Build Artifacts  

---

## 📂 Pipeline Workflow

1. **Checkout Repository**
2. **Set Up JDK 17**
3. **Cache Maven Dependencies**
4. **Build Project & Run Tests**
5. **Run Spotless for Formatting**
6. **Run Checkstyle for Code Linting**
7. **Run SpotBugs for Static Analysis**
8. **Run OWASP Dependency-Check**
9. **Generate JaCoCo Code Coverage Report**
10. **Upload Reports as Artifacts**
11. **Run SonarCloud Quality Analysis**
12. **Send Email Notification with Reports**

---
## ✅ SonarCloud Setup

> **Pre-requisites:**
> - Create a [SonarCloud](https://sonarcloud.io) account
> - Generate a `SONAR_TOKEN`
> - Add the token to your GitHub repository secrets

### Required Secrets

| Secret Name        | Description                       |
|--------------------|-----------------------------------|
| `SONAR_TOKEN`      | Token for SonarCloud authentication (Go to SonarCloud > My Account > Security, generate a token, and add it to GitHub secrets as SONAR_TOKEN) |
| `SENDER_MAIL`      | Email ID for sending notifications |
| `SENDER_PASSWORD`  | App password for email sender (Enable 2-Step Verification in Google Account > Security, generate an App Password under "App Passwords", and save it in GitHub secrets as SENDER_PASSWORD)    |
| `RECEIVER_MAIL`    | Target email address              |

## 📊 Reports & Dashboard

- 🔗 [SonarCloud Dashboard](https://sonarcloud.io/dashboard?id=mahek320_java-ci-code-quality)  
- 📄 Checkstyle Report (`checkstyle-report.xml`)  
- 📄 SpotBugs Report (`spotbugsXml.xml`)  
- 📄 OWASP Dependency-Check Report (`dependency-check-report.html`)  
- 📈 JaCoCo Coverage Report (`target/site/jacoco/index.html`)  

---

## 🚀 Technologies Used

- **Java 17**
- **Maven**
- **Checkstyle**
- **Spotless**
- **SpotBugs**
- **OWASP Dependency-Check**
- **JaCoCo**
- **SonarScanner**
- **GitHub Actions**

---

## 📬 Email Notification

Once the pipeline completes, you will receive an email containing:
- 📎 Reports (Checkstyle, SpotBugs, OWASP, JaCoCo)
- 🔗 Link to the SonarCloud dashboard  

---

Feel free to [explore the repository](https://github.com/mahek320/java-ci-code-quality) or open issues and contribute!




