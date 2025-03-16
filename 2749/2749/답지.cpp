#include <iostream>

long long n[1500050];
int INF = 1000000;

void fibonacci() {
	n[0] = 0;
	n[1] = 1;
	for (int i = 0; i < 1500000; i++) {
		n[i + 2] = (n[i + 1] + n[i]) % INF;
	}
}

int main() {
	long long m;
	std::cin >> m;
	fibonacci();
	std::cout << n[m % 1500000] << "\n";
}