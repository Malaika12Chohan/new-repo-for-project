package aligoldsmith.com.adapters;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Product;
import aligoldsmith.com.databinding.ShopRowBinding;
import aligoldsmith.com.models.product;
    public class ShopListAdapter extends ListAdapter<product,ShopListAdapter.shopViewHolder> {
    public ShopListAdapter() {
        super(product.itemCallback);
    }
    @NonNull
    @Override
    public shopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ShopRowBinding shopRowBinding = ShopRowBinding.inflate(layoutInflater,parent,false);
        return new shopViewHolder(shopRowBinding); }
        @Override
    public void onBindViewHolder(@NonNull ShopListAdapter.shopViewHolder holder, int position) {
        product product = getItem(position);
        holder.shopRowBinding.setProduct(product); }
        class shopViewHolder extends RecyclerView.ViewHolder{
        ShopRowBinding shopRowBinding;
        public shopViewHolder(ShopRowBinding binding) { super(binding.getRoot());this.shopRowBinding = binding;}}
    public interface ShopInterface {
        void addItem(product product);
        void onItemClick(product product);}}

