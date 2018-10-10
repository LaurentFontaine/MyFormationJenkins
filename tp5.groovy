node{
   stage('Hello'){
   echo "Hello ADEO"
   }
   stage('Env'){
   sh 'env'
   }
}
