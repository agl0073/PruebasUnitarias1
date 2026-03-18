# 🧪 Práctica: Pruebas Unitarias con JUnit 5

Este proyecto es una práctica guiada para aprender los fundamentos del **Software Testing**. El objetivo es validar la lógica de un sistema de registro de usuarios utilizando **JUnit 5** y **Maven** en el entorno de desarrollo **IntelliJ IDEA**.

---

## 🎯 Objetivo de la Práctica
Asegurar que la clase `ValidadorRegistro.java` funciona correctamente mediante la creación de una suite de pruebas automatizadas. Se han implementado tests para verificar que el sistema acepta datos válidos y bloquea datos incorrectos.

---

## 📋 Estructura de la Pruebas (Los 5 Retos)

| Reto | Descripción | Resultado Esperado | Assert Usado |
| :--- | :--- | :--- | :--- |
| **1** | Validar nombre vacío (`""`) | Rechazado (False) | `assertFalse` |
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/14779fa6-e07f-48f3-bb9e-12391e67e816" />

| **2** | Password en el límite (8 caracteres) | Aceptado (True) | `assertTrue` |
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/e3915a9f-b592-46f1-9e4c-1115fb1e472d" />

| **3** | Password demasiado corta (5 letras) | Rechazado (False) | `assertFalse` |
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/f794b326-8b37-4f75-a93d-7d5e9b841047" />

| **4** | Email sin formato válido (sin `@`) | Rechazado (False) | `assertFalse` |
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/95106037-144e-445b-a51d-631fab379340" />

| **5** | Edad mínima legal (16 años) | Aceptado (True) | `assertTrue` |
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/cd9be298-3d5b-46e4-8d2c-140eaadf845a" />

---

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 17
* **Framework:** JUnit 5 (Jupiter)
* **Gestor:** Maven
* **IDE:** IntelliJ IDEA

---

## ✅ Resultados del Test
Una vez ejecutada la clase `ValidadorRegistroTest.java`, el sistema confirma que todos los requisitos de validación se cumplen correctamente, mostrando todos los indicadores en verde.

**Autor:** agl0073

