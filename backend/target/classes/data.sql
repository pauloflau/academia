-- Inserindo estados
INSERT INTO tb_ESTADO (SIGLA, NOME) VALUES 
('AC','Acre'),
('AL','Alagoas'),
('AM','Amazonas'),
('AP','Amapá'),
('BA','Bahia'),
('CE','Ceará'),
('DF','Distrito Federal'),
('ES','Espírito Santo'),
('GO','Goiás'),
('MA','Maranhão'),
('MG','Minas Gerais'),
('MS','Mato Grosso do Sul'),
('MT','Mato Grosso'),
('PA','Pará'),
('PB','Paraíba'),
('PE','Pernambuco'),
('PI','Piauí'),
('PR','Paraná'),
('RJ','Rio de Janeiro'),
('RN','Rio Grande do Norte'),
('RO','Rondônia'),
('RR','Roraima'),
('RS','Rio Grande do Sul'),
('SC','Santa Catarina'),
('SE','Sergipe'),
('SP','São Paulo'),
('TO','Tocantins');

-- Inserindo alunos
INSERT INTO ALUNO (
    ID, NOME, SEXO, RG, NASCIMENTO, SITUACAO, EMAIL,
    RUA, NUMERO, COMPLEMENTO, CIDADE, ESTADO_ID, CEP,
    CELULAR_DDD, CELUlAR_NUMERO, FIXO_DDD, FIXO_NUMERO
) VALUES
('A001', 'João Silva', 'Masculino', 123456789, '1995-06-15', 'Ativo', 'joao.silva@email.com', 'Rua das Flores', 123, 'Apto 101', 'São Paulo', 'SP', '01001000', 11, 987654321, 11, 12345678),
('A002', 'Maria Oliveira', 'Feminino', 987654321, '2000-02-20', 'Ativo', 'maria.oliveira@email.com', 'Av. Brasil', 456, NULL, 'Rio de Janeiro', 'RJ', '20020020', 21, 998877665, NULL, NULL),
('A003', 'Pedro Santos', 'Masculino', 192837465, '1998-11-05', 'Pendente', 'pedro.santos@email.com', 'Rua dos Pinheiros', 789, 'Casa', 'Belo Horizonte', 'MG', '30130010', 31, 912345678, 31, 34567890),
('A004', 'Ana Costa', 'Feminino', 564738291, '1992-03-12', 'Ativo', 'ana.costa@email.com', 'Rua Vitória', 12, NULL, 'São Paulo', 'SP', '01002000', 11, 976543210, NULL, NULL),
('A005', 'Carlos Pereira', 'Masculino', 837261945, '1985-07-19', 'Inativo', 'carlos.pereira@email.com', 'Av. Paulista', 1500, 'Sala 3', 'São Paulo', 'SP', '01310000', 11, 998877665, 11, 22334455),
('A006', 'Beatriz Lima', 'Feminino', 293847561, '1997-01-30', 'Ativo', 'beatriz.lima@email.com', 'Rua do Catete', 77, 'Casa', 'Rio de Janeiro', 'RJ', '22220020', 21, 987654321, NULL, NULL),
('A007', 'Rafael Gomes', 'Masculino', 675849302, '1990-05-22', 'Ativo', 'rafael.gomes@email.com', 'Av. Afonso Pena', 1234, NULL, 'Belo Horizonte', 'MG', '30140010', 31, 912345678, 31, 33445566),
('A008', 'Juliana Martins', 'Feminino', 918273645, '2002-08-08', 'Pendente', 'juliana.martins@email.com', 'Rua Augusta', 321, 'Apto 202', 'São Paulo', 'SP', '01321000', 11, 987612345, NULL, NULL),
('A009', 'Lucas Fernandes', 'Masculino', 564738290, '1996-12-10', 'Ativo', 'lucas.fernandes@email.com', 'Rua da Lapa', 98, NULL, 'Rio de Janeiro', 'RJ', '20040050', 21, 998812345, 21, 22331144),
('A010', 'Camila Rocha', 'Feminino', 102938475, '1999-09-15', 'Ativo', 'camila.rocha@email.com', 'Rua Ouro Preto', 456, 'Casa', 'Belo Horizonte', 'MG', '30150020', 31, 912398765, 31, 44556677);

-- Inserindo entradas e saídas
INSERT INTO tb_ENTRADAS_SAIDAS (ID, ALUNO_ID, ENTRADA, SAIDA) VALUES
(1, 'A001', '2026-03-20 08:00:00', '2026-03-20 10:00:00'),
(2, 'A002', '2026-03-20 09:30:00', NULL),
(3, 'A003', '2026-03-19 18:00:00', '2026-03-19 19:30:00'),
(4, 'A004', '2026-03-20 07:45:00', '2026-03-20 09:00:00'),
(5, 'A005', '2026-03-19 12:00:00', '2026-03-19 13:30:00'),
(6, 'A006', '2026-03-20 10:15:00', NULL),
(7, 'A007', '2026-03-19 16:00:00', '2026-03-19 17:00:00'),
(8, 'A008', '2026-03-20 11:30:00', NULL),
(9, 'A009', '2026-03-20 08:15:00', '2026-03-20 09:45:00'),
(10, 'A010', '2026-03-19 14:00:00', '2026-03-19 15:30:00');