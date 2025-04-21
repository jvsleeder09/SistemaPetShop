
## 🐾 Manual de Instruções - Sistema Pet Shop

### 📌 Introdução ao Projeto

Este é um sistema de gerenciamento para um Pet Shop, feito em Java. O sistema permite o **cadastro de clientes e seus pets**, bem como a **contratação de serviços avulsos** ou **pacotes de serviços**, como banho e tosa, consulta veterinária, hospedagem e adestramento. O sistema também possibilita a gestão de agendamentos, garantindo que os clientes só contratem serviços para seus próprios pets.

---

### 🛠️ Tecnologias Utilizadas

- Java 11+
- **JOptionPane** para a interface gráfica

---

### 🧩 Funcionalidades

- 📇 **Cadastro de Clientes**:
  - Possibilidade de adicionar informações como nome, telefone e e-mail.
  - **Listar**, **Buscar** e **Excluir** clientes cadastrados.
  
- 🐾 **Cadastro de Pets**:
  - Cada cliente pode ter um ou mais pets.
  - Pets possuem informações como nome, espécie, raça, idade e peso.
  - **Listar**, **Buscar** e **Excluir** pets cadastrados.
  
- 📅 **Contratação de Serviços**:
  - Clientes podem contratar serviços avulsos ou pacotes de serviços, como:
    - Banho e tosa
    - Consulta veterinária
    - Hospedagem
    - Adestramento
  - **Listar**, **Buscar** e **Cancelar** serviços contratados.
  
- ⏰ **Agendamento de Serviços**:
  - É possível agendar serviços para **datas futuras**.
  - A **data de agendamento** é controlada e não permite agendar no passado.
  
- 💸 **Descontos em Pacotes de Serviços**:
  - Pacotes de serviços podem ter **descontos** em relação aos serviços avulsos.

---

### 🚀 Passo a Passo para a Execução

1. Clone o repositório disponibilizado.
   - [Passo a Passo disponibilizado no Youtube](https://www.youtube.com/watch?v=7yixbSXgC0k)

3. Importe o projeto em uma IDE Java (Eclipse IDE foi utilizado para a criação do sistema).

4. Execute o arquivo `Main.java`:
   - Navegue até a classe principal, nomeada de `Main.java`.
   - Clique com o botão direito e selecione **Run**.

---

### 💻 Interface

A interface foi desenvolvida utilizando janelas pop-up (`JOptionPane`) para entrada e exibição de dados.

---

### 📂 Estrutura de Pacotes

```
br.petshop.model (pacote principal)
├── classes criadas separadamente para melhor organização:
│   ├── Agendamento.java
│   ├── BanhoETosa.java
│   ├── Cliente.java
│   ├── ConsultaVeterinaria.java
│   ├── Hospedagem.java
│   ├── PacoteServicos.java
│   ├── Pet.java
│   └── Servico.java 
br.petshop.agendamento (pacote de agendamento de serviços)
│   └── Agendamento.java
br.petshop.main (pacote com a função principal)
│   └── Main.java
```

---

### ✍️ Exemplo de Uso

``` Após a copilação, há uma lista de 11 opções disponíveis, no entanto, destacarei apenas as opções consideradas principais de acordo com o projeto proposto```

```text
> (1. Cadastrar Novo Cliente)
Nome: Jon
Telefone: 61-0205-0502
E-mail: jon@email.com

> (6. Cadastrar Pet)
Nome do Cliente: Jon
Nome do Pet: Charlotte
Espécie: Gato
Raça: SRD
Idade: 5
Peso: 4,0

> (9. Contratar Serviço)
Serviço: BanhoETosa
Data: 20/05/2025 11:00
```

---

### 📃 Observações

- Os dados são armazenados **apenas em memória**. Isso significa que, ao reiniciar o sistema, as informações serão perdidas.
- O sistema foi desenvolvido como parte de um estudo para melhor entendimento de **Java** e **orientação a objetos**.
- Para a criação desse sistema, baseei-me em videos aulas disponveis na plataforma do Youtube, além do material didático fornecido em sala de aula. Abaixo segue os links dos videos utilizados.
  1. [Playlist - Introdução a Java](https://www.youtube.com/playlist?list=PLHz_AreHm4dkI2ZdjTwZA4mPMxWTfNSpR)
  2. [Video: Métodos e atributos STATIC](https://youtu.be/TW5FthKNr50?si=0RT8WxgFbnhEEhqK)
  3. [Video: Herança em Java](https://youtu.be/Cbdv96Wnr58?si=792BdJ8q_PKOI1jO)
  4. [Video: Entendendo SUPER em JAVA, superclasse e subclasse](https://youtu.be/8VzFrNPkN6U?si=WvhOkPeCSwOvGgVn)

---
