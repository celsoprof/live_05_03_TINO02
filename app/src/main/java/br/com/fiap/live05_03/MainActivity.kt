package br.com.fiap.live05_03

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.live05_03.ui.theme.Live0503Theme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      Live0503Theme {
        Row {
          MinhaTela()
          Spacer(modifier = Modifier.width(16.dp))
          MinhaTela()
          Spacer(modifier = Modifier.width(16.dp))
          MinhaTela()
          Spacer(modifier = Modifier.width(16.dp))
          MinhaTela()
        }
      }
    }
  }
}

@Composable
fun MinhaTela() {
  Surface(
    color = Color.Magenta,
    modifier = Modifier
      .width(100.dp)
      .height(200.dp)
  ) {
    Column(
      modifier = Modifier.background(color = Color(0xFFB24CB4))
    ) {
      Text(text = "FIAP")
      Text(text = "Paulista")
      Button(onClick = { }) {
        Text(text = "Clique")
      }
      Row {
        Button(onClick = { /*TODO*/ }) {
          Text(text = "Botão 1")
        }
        Button(onClick = { /*TODO*/ }) {
          Text(text = "Botão 2")
        }
        Button(onClick = { /*TODO*/ }) {
          Text(text = "Outro botão")
        }
      }
    }
  }
}

@Preview(showSystemUi = true)
@Composable
fun MinhaTelaPreview() {
  Live0503Theme {
    MinhaTela()
  }
}
