package dekz.id.tensorflowandroid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import java.util.List;
import java.util.Locale;

public interface Classifier {
    class Recognition {

        private final String id;
        private final String title;
        private final Float confidence;
        public String linknya;
        public String kodenya;

        public Recognition(final String id, final String title, final Float confidence) {
            this.id = id;
            this.title = title;
            this.confidence = confidence;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public Float getConfidence() {
            return confidence;
        }

        @Override
        public String toString() {
            String resultString = "";
            //if (id != null) {
            //resultString += "[" + id + "] ";
            //}

            if (title != null) {

                switch (title) {
                    case "Bis Sekolah":
                        linknya = "https://youtu.be/HwZcAsPMhmI";
                        kodenya = "HwZcAsPMhmI";
                        break;
                    case "Sepeda Gunung":
                        linknya = "https://youtu.be/ifwVdog6zSo";
                        kodenya = "ifwVdog6zSo";
                        break;
                    case "Sepeda":
                        linknya = "https://www.youtube.com/ifwVdog6zSo";
                        kodenya = "ifwVdog6zSo";
                        break;
                    case "Motor":
                        linknya = "https://youtu.be/HTJrmnkisk0";
                        kodenya = "HTJrmnkisk0";
                        break;
                    case "Kapal Kontainer":
                        linknya = "https://youtu.be/A7EzNeQFd-A";
                        kodenya = "A7EzNeQFd-A";
                        break;
                    case "Pesawat Udara":
                        linknya = "https://youtu.be/PLrQVND_s_A";
                        kodenya = "PLrQVND_s_A";
                        break;
                    case "Pesawat":
                        linknya = "https://youtu.be/PLrQVND_s_A";
                        kodenya = "PLrQVND_s_A";
                        break;
                    case "Jam":
                        linknya = "https://www.youtube.com/watch?v=HuT6Tn_pDBk";
                        kodenya = "HuT6Tn_pDBk";
                        break;
                    case "Jam Digital":
                        linknya = "https://youtu.be/HuT6Tn_pDBk";
                        kodenya = "HuT6Tn_pDBk";
                        break;
                    case "Jam Tangan Digital":
                        linknya = "https://youtu.be/HuT6Tn_pDBk";
                        kodenya = "HuT6Tn_pDBk";
                        break;
                    case "Baju Cardigan":
                        linknya = "https://youtu.be/uBdc16NJ6B0";
                        kodenya = "uBdc16NJ6B0";
                        break;
                    case "Baju Kaos":
                        linknya = "https://youtu.be/uBdc16NJ6B0";
                        kodenya = "uBdc16NJ6B0";
                        break;
                    case "Meja":
                        linknya = "https://youtu.be/l1k_SLknkFw";
                        kodenya = "l1k_SLknkFw";
                        break;
                    case "Meja Makan":
                        linknya = "https://youtu.be/l1k_SLknkFw";
                        kodenya = "l1k_SLknkFw";
                        break;
                    case "Kursi Barber":
                        linknya = "https://youtu.be/SMute7FUqOA";
                        kodenya = "SMute7FUqOA";
                        break;
                    case "Sepatu":
                        linknya = "https://youtu.be/kU9QelzVbjw";
                        kodenya = "kU9QelzVbjw";
                        break;
                    case "cowboy hat":
                        linknya = "https://youtu.be/TOLZG-Yh2vs";
                        kodenya = "TOLZG-Yh2vs";
                        break;
                    case "Bola":
                        linknya = "https://youtu.be/DPsE_TZ3Pig";
                        kodenya = "DPsE_TZ3Pig";
                        break;
                    case "Bola Basket":
                        linknya = "https://youtu.be/DPsE_TZ3Pig";
                        kodenya = "DPsE_TZ3Pig";
                        break;
                    case "Tas":
                        linknya = "https://youtu.be/4jUj4CKcZfg";
                        kodenya = "4jUj4CKcZfg";
                        break;
                    case "Nanas":
                        linknya = "https://youtu.be/rHp0veex_3g";
                        kodenya = "rHp0veex_3g";
                        break;
                    default:
                        linknya = "Maaf VideoSIBI Belum Terungg";
                        kodenya = "";
                        break;
                }

                //resultString += title + " link:" + linknya ;
                resultString += kodenya;




            }

            //if (confidence != null) {
            // resultString += String.format(
            // Locale.getDefault(),"(%.1f%%) ", confidence * 100.0f);
            // }

            return resultString.trim();
        }
    }


    List<Recognition> recognizeImage(Bitmap bitmap);

    void close();
}
