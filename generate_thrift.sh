mkdir ./thriftserver/generated
PID=$(docker run -d -v "$(pwd):/data" thrift:0.11.0 \
thrift -out /data/thriftserver/generated --gen java /data/interface/service.thrift)

sleep 5s
docker container rm $PID