package app.upc.com.appsql;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import app.upc.com.appsql.R;
import app.upc.com.appsql.Telefono;

public class TelefonoAdapter extends RecyclerView.Adapter<TelefonoAdapter.ViewHolder> {

    private Context context;
    private List<Telefono> lista_telefonos;
    private LayoutInflater inflador;

    public TelefonoAdapter(Context context, List<Telefono> lista_telefonos) {
        this.context = context;
        this.lista_telefonos = lista_telefonos;
        inflador = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.item_telefonos,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.titulo.setText(lista_telefonos.get(position).getTitulo());
        holder.telefono.setText(lista_telefonos.get(position).getTelefono());

    }

    @Override
    public int getItemCount() {
        return lista_telefonos.size();
    }


    class ViewHolder extends  RecyclerView.ViewHolder{

        TextView titulo, telefono;

        ViewHolder(View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.et_titulo);
            telefono = itemView.findViewById(R.id.et_telefono);
        }
    }
}
