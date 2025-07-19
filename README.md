# Parcial práctico sobre GraphQL

### Integrantes:
- Ricardo Medina Herrera
- Cristian Alberto Agudelo Marquez 
- Esteban Andres Castaño Gallo
- Osvairo Moreno Correa

### Profesor: 
Diego Jose Luis Botia Valderrama

## Mutations:
Agregar paciente:
```
mutation {
addPacient(
name:
"Esteban"
ssn: "123-123-21"
lastName: "perez"
age: 20
gender:
"hombre"
) {
id
LastName
age
gender
  }
}
```
Agregar doctor:

```
mutation {
  addDoctor(
    name: "Esteban"
    ssn: "123-123-21"
    speciality:"Cirujano"
  ) {
    id
    name
    ssn
    speciality
  }
}

```

Agregar historia clínica:

```
mutation {
  createClinicHistory(
    chiefComplaint: "Dolor abdominal"
    diagnostic: "Gastritis"
    treatment: "Omeprazol"
    date: "2025-07-18"
    pacientId: 1
    doctorId: 1
  ) {
    id
    diagnostic
    doctor {
      name
    }
    pacient {
      name
    }
  }
}

```

## Querys:

Consultar historias clínicas por cédula del paciente:

```
query {
  getHistories(ssn: "123-123-21") {
    id
    chiefComplaint
    diagnostic
    treatment
    date
    pacient {
      id
      name
      lastName
      ssn
    }
    doctor {
      id
      name
      ssn
      speciality
    }
  }
}

```

## Tecnologías usadas:

- Spring Boot
- Docker
- GraphQL
- Java 17

  Para ejecutar la aplicación utilizamos maven para construir el .jar (Si no lo tienes puedes ejecutar el siguiente comando: ` mvn clean package -DskipTests `) y luego ejecutamos el siguiente comando:
  ```
  docker-compose up 
  ```
  
