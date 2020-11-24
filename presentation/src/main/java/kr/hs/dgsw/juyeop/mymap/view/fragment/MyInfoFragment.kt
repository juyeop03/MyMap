package kr.hs.dgsw.juyeop.mymap.view.fragment

import kr.hs.dgsw.juyeop.mymap.base.view.BaseFragment
import kr.hs.dgsw.juyeop.mymap.databinding.FragmentMyInfoBinding
import kr.hs.dgsw.juyeop.mymap.viewmodel.fragment.MyInfoViewModel
import kr.hs.dgsw.juyeop.mymap.viewmodelfactory.fragment.MyInfoViewModelFactory
import kr.hs.dgsw.juyeop.mymap.widget.extension.getViewModel
import javax.inject.Inject

class MyInfoFragment : BaseFragment<FragmentMyInfoBinding, MyInfoViewModel>() {

    @Inject
    lateinit var viewModelFactory: MyInfoViewModelFactory

    override val viewModel: MyInfoViewModel
        get() = getViewModel(viewModelFactory)

    override fun observerViewModel() {}
}