public void trimSilenceFromBeginning(){
	
	for( int i = 0; i<=this.samples.length(); i++){
		
		if(i==0){
			
		       int[] newSamples = new int[this.samples.length - i];
		       for (int j = 0; j < newSamples.length; j++, i++) {
		           newSamples[j] = this.samples[i];
		       }
		       this.samples = newSamples;
		}
		
	}

}