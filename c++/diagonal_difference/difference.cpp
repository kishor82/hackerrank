#include<bits/stdc++.h>

using namespace std;

//This solution 
int diagonalDofferece(vector<vector<int>> arr){
	int rt=0 ,lft=0;
	for (int i=0;i<arr.size();i++) lft+=arr[i][i];
	for(int i=arr.size()-1,j=0;i>=0 && j<arr.size();i--,j++)rt+=arr[i][j];

	cout << abs(lft-rt);
	return abs(lft-rt);
}

int main(){
	ofstream fout(getenv("OUTPUT_PATH"));

	int n ;
	cin >> n;
	cin.ignore(numeric_limits<streamsize>::max(),'\n');

	vector<vector<int>> arr(n);
	for(int i=0;i<n;i++){
		arr[i].resize(n);

		for(int j=0;j<n;j++){
			cin >> arr[i][j];
		}

		cin.ignore(numeric_limits<streamsize>::max(),'\n');
	}
	int result = diagonalDofferece(arr);

	fout << result << "\n";
	fout.close();
	return 0 ;
}