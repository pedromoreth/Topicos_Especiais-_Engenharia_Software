import pygame
import random

# Configurações do tabuleiro
GRID_SIZE = 50
CELL_SIZE = 10
WIDTH, HEIGHT = GRID_SIZE * CELL_SIZE, GRID_SIZE * CELL_SIZE

# Cores
WHITE = (255, 255, 255)
BLUE = (0, 0, 255)
BLACK = (0, 0, 0)

# Estados das células
EMPTY = 0
AZUL = 1
ZOMBIE = 2

# Inicialização do tabuleiro
tabuleiro = [[EMPTY for _ in range(GRID_SIZE)] for _ in range(GRID_SIZE)]

# Adiciona elementos iniciais
def iniciar_tabuleiro():
    for _ in range(GRID_SIZE * 2):  # Número inicial de elementos
        x, y = random.randint(0, GRID_SIZE // 2 - 1), random.randint(0, GRID_SIZE - 1)  # Azul apenas na metade esquerda
        tabuleiro[y][x] = AZUL
    for _ in range(GRID_SIZE * 2):  # Número inicial de zumbis
        x, y = random.randint(0, GRID_SIZE - 1), random.randint(0, GRID_SIZE - 1)
        tabuleiro[y][x] = ZOMBIE

# Verifica se o jogo acabou
def verificar_fim_de_jogo():
    todos_zumbis = True
    azul_na_direita = False
    for y in range(GRID_SIZE):
        for x in range(GRID_SIZE):
            if tabuleiro[y][x] == AZUL:
                todos_zumbis = False
                if x == GRID_SIZE - 1:
                    azul_na_direita = True
    return todos_zumbis or azul_na_direita

# Atualiza o tabuleiro
def atualizar_tabuleiro():
    novas_posicoes = [[EMPTY for _ in range(GRID_SIZE)] for _ in range(GRID_SIZE)]
    for y in range(GRID_SIZE):
        for x in range(GRID_SIZE):
            if tabuleiro[y][x] == AZUL or tabuleiro[y][x] == ZOMBIE:
                dx, dy = random.choice([(0, 1), (1, 0), (0, -1), (-1, 0)])
                nx, ny = x + dx, y + dy
                if 0 <= nx < GRID_SIZE and 0 <= ny < GRID_SIZE:
                    if tabuleiro[ny][nx] == ZOMBIE and tabuleiro[y][x] == AZUL:
                        novas_posicoes[ny][nx] = ZOMBIE  # Azul vira zumbi
                    else:
                        novas_posicoes[ny][nx] = tabuleiro[y][x]
                else:
                    novas_posicoes[y][x] = tabuleiro[y][x]
    return novas_posicoes

# Renderiza o tabuleiro
def desenhar_tabuleiro(screen):
    screen.fill(WHITE)
    for y in range(GRID_SIZE):
        for x in range(GRID_SIZE):
            if tabuleiro[y][x] == AZUL:
                pygame.draw.rect(screen, BLUE, (x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE))
            elif tabuleiro[y][x] == ZOMBIE:
                pygame.draw.rect(screen, BLACK, (x * CELL_SIZE, y * CELL_SIZE, CELL_SIZE, CELL_SIZE))
    pygame.display.flip()

# Inicializa o jogo
pygame.init()
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Jogo de Programação Concorrente")
iniciar_tabuleiro()

# Loop principal
rodando = True
while rodando:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            rodando = False
    tabuleiro = atualizar_tabuleiro()
    desenhar_tabuleiro(screen)
    if verificar_fim_de_jogo():
        rodando = False
    pygame.time.delay(100)

pygame.quit()
