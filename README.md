# Kubernetes-Spring-PostgreSql

mvn package install -DskipTests=true

docker build -t mertcakmak2/springboot-postgres-k8s .

docker push mertcakmak2/springboot-postgres-k8s

kubectl apply -f postgres-configmap.yaml

kubectl apply -f postgres-deployment.yaml

kubectl apply -f deployment.yaml


http://167.172.105.147:30163/api/employees

![image](https://user-images.githubusercontent.com/21373505/143537716-550824ff-97fb-4cd1-989a-d2b84d47dffe.png)
