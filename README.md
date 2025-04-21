## 🐾 Manual de Instruções - Sistema Pet Shop

### 📌 Introdução ao Projeto

Este é um sistema simples de gerenciamento de um Pet Shop, feito em Java. O sistema permite o **cadastro de clientes, pets e agendamentos de serviços** como banho e tosa, hospedagem, adestramento e consulta veterinária.

---

### 🛠️ Tecnologias Utilizadas

- Java
- JOptionPane para a interface gráfica

---

### 🧩 Funcionalidades

- 📇 Cadastro de clientes e pets
- 📅 Agendamento de serviços
- 🔍 Busca por agendamentos
- 📋 Listagem geral
- ❌ Cancelamento de serviços

---

### 🚀 Passo a Passo para a execução

1. Clone o repositório existente

2. Importe o projeto em uma IDE Java (Eclipse IDE foi utilizado para criação do sistema)

3. Execute o arquivo `Main.java`:
   - Navegue até a classe principal, nomeado de `Main.java`
   - Clique com o botão direito e selecione `Run`

---

### 💻 Interface

A interface foi feita via janelas pop-up (`JOptionPane`) para entrada e exibição de dados. 
---

### 📂 Estrutura de Pacotes

```
com.petshop.model (package1)
├── classes criadas separadamente para uma organização melhor
│   ├── Agendamento.java
│   ├── BanhoETosa.java
│   ├── Cliente.java
│   └── ConsultaVeterinaria.java
|   └── Hospedagem.java
|   └── PacoteServicos.java
|   └── Pet.java
|   └── Servico.java
com.petshop.agendamento (package2)
│   └── Agendamento.java
com.petshop.main (package3 e função principal)
|   └── Main.java
```

---

### ✍️ Exemplo de Uso

``` Após copilação, há uma lista de 11 opções disponíveis mas deixarei exemplo apenas das opções que considero principais de acordo com o projeto proposto```

```text
> (1.Cadastrar Novo Cliente)
Nome: Jon
Telefone: 61-0205-0502
E-mail: jon@email.com

> (6.Cadastrar Pet)
Nome do Cliente: Jon
Nome do Pet: Charlotte
Especie: Gato
Raça: SRD
Idade: 5
Peso: 4,0

> (9.Contratar Serviço)
Serviço: BanhoETosa
Data: 20/05/2025 11:00
```

---

### 📃 Observações

- Os dados são armazenados apenas em memória.
- Para a criação do sistema, utilizei aulas disponibilizadas na plataforma do Youtube para orientação e estudo afundo sobre Java e melhor forma de criação de sistema para cadastramentos de entidades e interações. Logo, abaixo seguem algumas que utilizei para um entendimento básico mas funcional.
-  1. https://www.youtube.com/playlist?list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR
   2. https://youtu.be/TW5FthKNr50?si=0RT8WxgFbnhEEhqK
   3. https://youtu.be/Cbdv96Wnr58?si=792BdJ8q_PKOI1jO
   4. https://youtu.be/8VzFrNPkN6U?si=WvhOkPeCSwOvGgVn
