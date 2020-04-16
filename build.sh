 VERSION=1.6
 docker build --progress=plain -t registry.cn-hangzhou.aliyuncs.com/mflyyou/docker-service:${VERSION} . && docker push registry.cn-hangzhou.aliyuncs.com/mflyyou/docker-service:${VERSION}