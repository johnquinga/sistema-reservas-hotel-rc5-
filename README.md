# sistema-reservas-hotel-rc5-
Sistema de gestión de reservas de hotel - RC5
# Sistema de Gestión de Reservas de Hotel

**Asignatura:** ISWZ1103 - Programación II  
**Actividad:** RC5 - Trabajo en Equipo  

## 👥 Integrantes del Equipo
- **Jonathan Quinga** - Desarrollador Backend y Arquitecto
- **Adriana Chalavarri** - Desarrolladora Frontend y Tester

## 📋 Descripción del Proyecto
Sistema básico de gestión de reservas de hotel implementado en Java, aplicando principios de Programación Orientada a Objetos (POO).

## ✅ Funcionalidades Implementadas
- [x] Consultar disponibilidad de habitaciones
- [x] Crear nuevas reservas
- [x] Cancelar reservas existentes
- [x] Mostrar estado de habitaciones
- [x] Listar reservas actuales
- [x] Validación de datos de entrada
- [x] Manejo de errores robusto

## 🏗️ Arquitectura del Sistema
- **Habitacion.java** - Clase que representa una habitación individual (Por Jonathan Quinga)
- **Hotel.java** - Clase principal que gestiona habitaciones y reservas (Por Jonathan Quinga)
- **Reserva.java** - Clase que representa una reserva de cliente (Por Adriana Chalavarri)
- **Main.java** - Interfaz de usuario y punto de entrada del programa (Por Adriana Chalavarri)

## 🚀 Cómo Ejecutar el Sistema

### Opción 1: Compilación Manual
```bash
# Clonar el repositorio
git clone https://github.com/johnquinga/sistema-reservas-hotel-rc5.git
cd sistema-reservas-hotel-rc5

# Compilar los archivos Java
javac src/*.java

# Ejecutar el programa
java -cp src Main
```

### Opción 2: IDE (Recomendado)
1. Importar el proyecto en tu IDE favorito (Eclipse, IntelliJ, VS Code)
2. Ejecutar la clase `Main.java`

## 📖 Manual de Usuario

### Menú Principal
1. **Hacer una reserva** - Permite crear una nueva reserva
2. **Cancelar una reserva** - Cancela una reserva existente
3. **Consultar disponibilidad** - Verifica si una habitación está disponible
4. **Ver todas las reservas** - Lista todas las reservas activas
5. **Ver estado de habitaciones** - Muestra el estado de todas las habitaciones
6. **Salir** - Termina el programa

### Características del Sistema
- **5 habitaciones disponibles** (numeradas del 1 al 5)
- **Validación de entrada** para prevenir errores
- **Manejo de excepciones** robusto
- **Interfaz de texto** intuitiva

## 📸 Evidencias de Funcionamiento
Las evidencias del funcionamiento del sistema se encuentran en la carpeta `evidencias/`:
- Capturas de pantalla del proceso completo
- Video demostrativo del sistema en funcionamiento

## 🎯 Cumplimiento de Objetivos RC5
- ✅ **Planteamiento de Roles:** Roles definidos según habilidades individuales
- ✅ **Trabajo Colaborativo:** Desarrollo conjunto con revisión cruzada
- ✅ **Cumplimiento de Objetivos:** Todas las funcionalidades implementadas y probadas
- ✅ **Aplicación de POO:** Uso correcto de clases, objetos, encapsulación y métodos

## 🔧 Detalles Técnicos
- **Lenguaje:** Java
- **Paradigma:** Programación Orientada a Objetos
- **Estructura de datos:** ArrayList para manejo dinámico
- **Validaciones:** Control de entrada de usuario
- **Manejo de errores:** Try-catch y validaciones preventivas

## 📝 Documentación Adicional
- [Planificación de Roles y Tareas](docs/Planificacion_Roles_Tareas.md)
- Comentarios detallados en el código fuente
- Manual de usuario integrado

## 🏆 Características Destacadas
- **Código limpio y bien documentado**
- **Interfaz de usuario amigable**
- **Manejo robusto de errores**
- **Arquitectura escalable**
- **Funcionalidades completas**

---
*Desarrollado como parte del curso de Programación II - Universidad Tecnológica Indoamérica*
