package com.damazo.bikes.ui.stolen.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.damazo.bikes.R
import com.damazo.bikes.databinding.FragmentStolenBinding
import com.damazo.bikes.model.StolenBike
import com.damazo.bikes.ui.stolen.data.remote.StolenRemoteDataSource
import com.damazo.bikes.ui.stolen.data.repository.StolenRepository
import com.damazo.bikes.ui.stolen.presentation.StolenUiModel
import com.damazo.bikes.ui.stolen.presentation.view.adapter.GridItemDecorator
import com.damazo.bikes.ui.stolen.presentation.view.adapter.StolenBikeAdapter
import com.damazo.bikes.ui.stolen.presentation.viewmodel.StolenViewModel
import com.damazo.bikes.ui.stolen.presentation.viewmodel.StolenViewModelFactory


class StolenFragment : Fragment() {

    private lateinit var stolenViewModel: StolenViewModel

    private lateinit var stolenBinding: FragmentStolenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        stolenViewModel = ViewModelProviders.of(
            this,
            StolenViewModelFactory(StolenRepository(StolenRemoteDataSource()))
        ).get(StolenViewModel::class.java)

        stolenBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_stolen, container, false)

        return stolenBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView(listOf(
            StolenBike(12L,
                "Giant",
                "Reign Advanced",
                "https://giantcdn-qu2qwwv2de7wv85rz.stackpathdns.com/remote/www.giant-bicycles.com/_upload_mx/bikes/models/xxl/Reign%20ADV%201_Red.jpg?width=2000&quality=80&mode=none&bgcolor=white",
                2017,
                "Naranja",
                "M",
                "Desierto de los leones"),
            StolenBike(12L,
                "Giant uhuyhuhd d ij iji ji ji  jijijijijij o kokoko okokok okokok okokok kokokok ookokoko kokok okokok okok ok ok ok oko ko ",
                "Reign",
                "https://giantcdn-qu2qwwv2de7wv85rz.stackpathdns.com/remote/www.giant-bicycles.com/_upload_mx/bikes/models/xxl/Reign%20ADV%201_Red.jpg?width=2000&quality=80&mode=none&bgcolor=white",
                2019,
                "",
                "",
                "84874874"),
            StolenBike(12L,
                "Trek",
                "Slash",
                "https://giantcdn-qu2qwwv2de7wv85rz.stackpathdns.com/remote/www.giant-bicycles.com/_upload_mx/bikes/models/xxl/Reign%20ADV%201_Red.jpg?width=2000&quality=80&mode=none&bgcolor=white",
                2019,
                "",
                "",
                "84874874"),
            StolenBike(12L,
                "Giant",
                "Reign",
                "https://giantcdn-qu2qwwv2de7wv85rz.stackpathdns.com/remote/www.giant-bicycles.com/_upload_mx/bikes/models/xxl/Reign%20ADV%201_Red.jpg?width=2000&quality=80&mode=none&bgcolor=white",
                2019,
                "",
                "",
                "84874874")
        ))
        /*stolenViewModel.publicModel.observe(this, Observer {
            when(it){
                StolenUiModel.ProgressBar -> Unit
                //StolenUiModel.Content -> Unit
                //StolenUiModel.Navigation -> Unit
            }
        })*/


    }

    private fun setupRecyclerView(bikes: List<StolenBike>) {
        stolenBinding.bikeStolenRV.apply {
            setHasFixedSize(true)
            addItemDecoration(GridItemDecorator(10, 2))
            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            adapter = StolenBikeAdapter(bikes)
        }
    }

}