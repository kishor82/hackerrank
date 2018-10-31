#include <bits/stdc++.h>

using namespace std;

int main(){
	int a,b;
	cin >> a >> b;
	cin.ignore(numeric_limits<streamsize>::max(),'\n');

	string num[11] = {"even","odd","one","two","three","four","five","six"
	,"seven","eight","nine"};

	for(int i=a;i<=b;i++){

	if((i > 9) && (i%2==0)){
		cout << num[0]<<endl;
	}else if((i > 9) && (i%2!=0)){
		cout << num[1]<<endl;
	}else{
		cout << num[i+1]<<endl;
	}
	
	}
	return 0;
}