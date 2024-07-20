# SOLID
![GitHub last commit](https://img.shields.io/github/last-commit/sanchezih/solid-java)
![GitHub repo size](https://img.shields.io/github/repo-size/sanchezih/solid-java)

SOLID es un conjunto de principios extraidos de los escritos de Robert C. Martin a principios de la decada de 2000. Se propuso como una forma de pensar especificamente en la calidad de la programacion orientada a objetos (OO). En conjunto, los principios SOLID presentan argumentos sobre como se debe dividir el codigo, que partes deben ser internas o expuestas y como el codigo debe usar otro codigo.

## Principios

| Inicial | Acronimo | Concepto |
|:-:|:-:|---|
| S | SRP | Principio de responsabilidad unica (Single responsibility principle): Cada clase debe tener un unico proposito y no estar llena de funcionalidad excesiva. |
| O | OCP |	Principio de abierto/cerrado (Open/closed principle): Las clases deben estar abiertas para extension y cerradas para modificacion. En otras palabras, no se deberia tener que reescribir una clase existente para implementar nuevas funciones. |
| L | LSP |	Principio de sustitucion de Liskov (Liskov substitution principle): Esto significa que cada subclase debe ser sustituible por su superclase. |
| I | ISP |	Principio de segregacion de la interfaz (Interface segregation principle): Las interfaces no deberian obligar a las clases a implementar lo que no pueden hacer. Las interfaces grandes deben dividirse en interfaces mas chicas. |
| D | DIP |	Principio de inversion de la dependencia (Dependency inversion principle): Los componentes deberian depender de abstracciones y no de clases concretas. |
