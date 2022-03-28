package com.example.jetfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController

class JustMainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return ComposeView(requireContext()).apply {
            setContent {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                        .border(BorderStroke(1.dp, Color.Gray))
                ) {
                    Text(text = "This is composable inside the Fragment!")
                    Spacer(modifier = Modifier.padding(10.dp))

                    CircularProgressIndicator()
                    Spacer(modifier = Modifier.padding(10.dp))

                    Text(text = "More composable inside the Fragment!")
                    Spacer(modifier = Modifier.padding(10.dp))

                    Button(
                        onClick = {
                            findNavController(this@JustMainFragment).navigate(R.id.action_justMainFragment_to_anotherFragment)
                        }) {
                        Text(text = "Next Fragment")
                    }
                }
            }
        }

    }
}