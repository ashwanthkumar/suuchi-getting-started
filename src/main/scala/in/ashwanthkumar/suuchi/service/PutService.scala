package in.ashwanthkumar.suuchi.service

import in.ashwanthkumar.suuchi.examples.generated.ExampleRPC.{PutRequest, PutResponse}
import in.ashwanthkumar.suuchi.examples.generated.{ExampleRPC, PutGrpc}
import in.ashwanthkumar.suuchi.store.WriteStore
import io.grpc.stub.StreamObserver

class PutService(store: WriteStore) extends PutGrpc.PutImplBase {
  override def put(request: PutRequest, responseObserver: StreamObserver[PutResponse]) = ???
}
