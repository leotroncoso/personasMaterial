import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.personasmaterial.Persona;
import com.example.personasmaterial.R;

import java.util.ArrayList;

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.PersonaViewholder> {
    private ArrayList<Persona> personas;

    public AdaptadorPersona(ArrayList<Persona> personas){
        this.personas=personas;
    }

    @Override
    public PersonaViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_persona,viewGroup, false);
        return new PersonaViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaViewholder personaViewholder, int i) {
        Persona p = personas.get(i);
        personaViewholder.foto.setImageResource(p.getFoto());
        personaViewholder.nombre.setText(p.getNombre());
        personaViewholder.nombre.setText(p.getApellido());

    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public static class PersonaViewholder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private EditText nombre;
        private EditText apellido;
        private View v;

        public PersonaViewholder(View itemView){
            super(itemView);
            v = itemView;
            foto = v.findViewById(R.id.foto);
            nombre = v.findViewById(R.id.lblNombre);
            apellido = v.findViewById(R.id.lblApellido);
        }
    }
}
