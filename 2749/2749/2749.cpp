#include <iostream>

long long fibonacci_optimized(long n) {
    if (n <= 1) return n; // n이 0 또는 1이면 그대로 반환

    long prev2 = 0; // F(0)
    long prev1 = 1; // F(1)
    long current = 0;

    for (long i = 2; i <= n; ++i) {
        current = prev1 + prev2; // 현재 피보나치 수 계산
        prev2 = prev1; // 이전 값 업데이트
        prev1 = current; // 현재 값을 다음 루프의 이전 값으로 설정
    }

    return current;
}

int main() {
    long n;
    std::cin >> n;

    std::cout << fibonacci_optimized(n) % 1000000 << std::endl;

    return 0;
}
