package chapter5_3;

import java.util.List;

public class FindFirstCommonNode {

	public int getFirstCommonNode(List<Integer> aList1, List<Integer> aList2){
		
		if (aList1.size()==0 || aList2.size() == 0) {
			return -1;
		}
		
		int lengthDif = aList1.size() - aList2.size();
		
		int aList1Index = lengthDif;
		int aList2Index = 0;
		
		if (aList1.size() < aList2.size()) {
			lengthDif = aList2.size() - aList1.size();
			aList1Index = 0;
			aList2Index = lengthDif;
		}
		
		while (aList1Index < aList1.size() && aList2Index < aList2.size()) {
			if (aList1.get(aList1Index)!=aList2.get(aList2Index)) {
				aList1Index++;
				aList2Index++;
			}else {
				break;
			}		
		}
		
		if (aList1Index >= aList1.size() && aList2Index >= aList2.size()) {
			return -1;
		}
		
		return aList1.get(aList1Index);
		
	}
	
}
