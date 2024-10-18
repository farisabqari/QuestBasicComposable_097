package com.example.questbasiccomposable

    import com.example.questbasiccomposable.R
    import android.R.id
    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.activity.enableEdgeToEdge
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.padding
    import androidx.compose.material3.Scaffold
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.font.FontFamily
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.sp
    import androidx.compose.ui.unit.dp
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.size
    import com.example.questbasiccomposable.ui.theme.QuestBasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        name = "Nama",
                        nama = "Muhammad Faris Abqari",
                        NIM = "20220140097",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicCompose(
    name: String,
    nama : String,
    NIM : String,
    modifier: Modifier = Modifier
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "Indonesia",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            fontFamily = FontFamily.SansSerif
        )

        Text(text = "Menuju Indonesia Emas",
            fontSize = 15.sp
        )
        Image(
            painter = painterResource(id = R.drawable.logofifa),
            contentDescription = null,
            modifier = Modifier.size(250.dp)
        )

    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposableTheme {
        BasicCompose("Nama","Muhammad Faris Abqari", "20220140097")    }
}