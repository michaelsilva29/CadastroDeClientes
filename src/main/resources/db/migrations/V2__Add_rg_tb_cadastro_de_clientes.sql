-- V2: Migrations para adicionar a coluna de RG na tabela de cadastros de clientes

ALTER TABLE TB_CADASTRO_DE_CLIENTES
ADD COLUMN rg VARCHAR(255);