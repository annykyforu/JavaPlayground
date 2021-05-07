package duke.choice;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemList implements Handler {
    private Clothing[] items;

    public ItemList(Clothing[] _items) {
        this.items = _items;
    }

    @Override
    public void accept(ServerRequest serverRequest, ServerResponse serverResponse) {
        serverResponse.status(Http.Status.OK_200);
        serverResponse.headers().put("Content-Type", "text/plain; charset=UTF-8");
        StringBuilder output = new StringBuilder();
        for(Clothing item : items){
            output.append(item+"\n");
        }
        serverResponse.send(output);
    }
}
