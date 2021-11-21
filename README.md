# Kubernetes-Spring-PostgreSql

mvn package install -DskipTests=true

docker build -t mertcakmak2/springboot-postgres-k8s .

docker push mertcakmak2/springboot-postgres-k8s

kubectl apply -f postgres-secret.yaml

kubectl apply -f postgres-configmap.yaml

kubectl apply -f postgres-deployment.yaml

kubectl apply -f deployment.yaml
