# kotlin-minesweeper

## 2단계 - 지뢰 찾기(지뢰 개수)

### 기능 요구사항

- [x] 높이와 너비, 지뢰 개수를 입력받을 수 있다.
- 도메인 모델링
  - [x] 좌표(`Coordinate`) 클래스 구현
  - [x] 칸(`Cell`) 인터페이스 및 지뢰 칸 (`MinedCell`)과 일반 칸(`EmptyCell`) 클래스 구현
  - [x] 판(`Board`) 클래스 구현
  - [x] 칸 주변 방향(`Direction`) 클래스 구현
  - [x] 좌표(`Coordinate`) 주변 8개의 좌표를 구한다.
  - [x] 판의(`Board`) 칸은 자신을 제외한 주변 8개 사각형에 포함된 지뢰의 개수를 구할 수 있다.
- 지뢰 찾기 판을 생성할 수 있다.
  - [x] 지정한 높이와 너비의 판을 생성할 수 있다.
  - [x] 지정한 지뢰 개수를 랜덤하게 배치한다.
- 지뢰찾기 판을 출력할 수 있다.
  - [x] ~~아직 열지 않은 칸은 `C`로 표기한다.~~
  - [x] 지뢰는 `*`로 표기한다.
  - [ ] 지뢰가 없는 칸은 주변 지뢰의 개수를 표기한다.
