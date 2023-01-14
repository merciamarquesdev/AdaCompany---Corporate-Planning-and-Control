# AdaCompany---Controle-Empresarial
Funcionalidades para um sistema de controle empresarial

-> Foi criado um projeto do zero utilizando o site https://start.spring.io
Com as seguintes dependências: Spring Web, Spring Data e H2

-> Funcionalidade criada para controle de usuários:
Inserir um usuário (Obs: Não deverá aceitar um usuário com o CPF duplicado)
Listar um usuário por ID
Listar todos usuários
Remover um usuário por ID

Classe: Usuario
Atributos:
Id
Nome
Telefone
CPF
E-mail
CEP
Logradouro
Número da casa
Bairro
Estado

-> Funcionalidades criadas para controle de Despesa:
Inserir uma despesa (Obs: Não pode existir despesa com o número de NF repetida)
Listar uma despesa por ID
Listar todas despesas cadastradas
Remover uma despesa por ID

Classe: Despesa
Atributos:
Fornecedor
Categoria
Número da NF
Valor da NF
Data de Vencimento
Pago (True ou False)

-> Funcionalidade criada para controle de funcionários:
Inserir um funcionário
Não pode existir um funcionário com o CPF repetido
Listar um funcionário por ID
Listar todos funcionários cadastrados
Remover um funcionário por ID

Classe: Funcionario
Atributos:
Id
Nome
Telefone
CPF
E-mail
Data de contratação
CEP
Logradouro
Número da casa
Bairro
Estado

-> Funcionalidade criada para controle de veículos:
Inserir um veiculo
Não deve permitir um veiculo com a placa repetida
Listar veiculo por ID
Listar todos os veículos
Remover um veículo por ID

Classe: Veículo
Atributos:
Descrição
Tipo (Moto, carro, caminhão)
Placa
Marca
Ano Fabricação
Ano Modelo
Data da compra
IPVA Vencido (true ou false)

-> Abstração de Usuário e Endereço
Classe responsável pelo endereço.
A classe Endereço possui os atributos que foram inseridos na classe Usuário e possui uma relação de Funcionário para Endereço de 1 para 1.
No momento de salvar o Usuário, deverá ser armazenado também o Endereço.

-> Abstraição de Funcionário e Endereço
Além do relacionamento entre Usuário e Endereço, também será necessário o relacionamento entre Funcionário X Endereço.
No momento da inserção de um Funcionário, deverá ser armazenado também o Endereço.

-> Endpoint para consulta de Veículos por Ano
Criação de um endpoint para consulta de veículos que correspondam com o Parâmetro enviado pelo GET, trazendo apenas os veículos que correspondem aquele Ano.
