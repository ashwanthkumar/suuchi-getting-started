package in.ashwanthkumar.suuchi.service

import in.ashwanthkumar.suuchi.examples.generated.ExampleRPC.{GetRequest, GetResponse}
import in.ashwanthkumar.suuchi.examples.generated.{ExampleRPC, ReadGrpc}
import in.ashwanthkumar.suuchi.store.ReadStore
import io.grpc.stub.StreamObserver

class ReadService(store: ReadStore) extends ReadGrpc.ReadImplBase {
  override def get(request: GetRequest, responseObserver: StreamObserver[GetResponse]) = ???
}

