# Kubernetes-Spring-PostgreSql-Redis

mvn package install -DskipTests=true

docker build -t mertcakmak2/springboot-postgres-k8s .

docker push mertcakmak2/springboot-postgres-k8s

`Redis Deployment`

kubectl apply -f redis-ns.yaml

kubectl apply -f redis-service.yaml

kubectl apply -f redis-deployment.yaml

`Postgres Deployment`

kubectl apply -f postgres-configmap.yaml

kubectl apply -f postgres-deployment.yaml

`Spring App Deployment`

kubectl apply -f deployment.yaml

# **Response**

http://167.172.105.147:30163/api/employees

![image](https://user-images.githubusercontent.com/21373505/143537716-550824ff-97fb-4cd1-989a-d2b84d47dffe.png)
