-- V2: Migration para adicionar a coluna de ranking na tabela de cadastros
ALTER TABLE TB_CADASTRO
ADD COLUMN rank VARCHAR(255);