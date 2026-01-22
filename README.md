# To-Do List - Java Swing

Este é um gerenciador de tarefas desenvolvido para unir funcionalidade e uma experiência de uso acolhedora. O projeto foca na organização de rotinas de forma clara, permitindo o gerenciamento de estados (tarefas pendentes vs. concluídas) com uma interface intuitiva.

![Demonstração do Projeto](to-do.gif)

##  Diferenciais do Projeto
Muitas vezes, ferramentas nativas como o **Java Swing** são vistas como limitadas. Este projeto prova que escolhas de design inteligentes podem transformar essa percepção. Foquei em criar uma estética *cozy* e minimalista, priorizando:
* **Hierarquia Visual:** Uso estratégico de espaçamento (padding) e fontes.
* **Customização de UI:** Ajuste manual de bordas, cores e o uso do *Look and Feel* Nimbus para fugir do visual padrão "antigo" do Java.

##  Tecnologias e Arquitetura
Para garantir que o software fosse organizado e escalável, utilizei a arquitetura **MVC (Model-View-Controller)**, conceito que aprofundei durante o segundo semestre da minha graduação.

* **Linguagem:** Java 17+
* **Interface Gráfica:** Java Swing / AWT
* **Padrões:** Orientação a Objetos (Encapsulamento e Polimorfismo)
* **Gestão de Dados:** `DefaultListModel` para atualizações da interface em tempo real.

##  Como rodar a aplicação
1. Certifique-se de ter o JDK instalado em sua máquina.
2. Clone o repositório:
   ```bash
   git clone https://github.com/lorenzzop/java-todo-list.git