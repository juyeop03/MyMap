package kr.hs.dgsw.juyeop.domain.usecase

import io.reactivex.Single
import kr.hs.dgsw.juyeop.domain.base.ParamUseCase
import kr.hs.dgsw.juyeop.domain.entity.Spot
import kr.hs.dgsw.juyeop.domain.repository.SpotRepository
import javax.inject.Inject

class GetSpotUseCase @Inject constructor(
    private val spotRepository: SpotRepository
): ParamUseCase<GetSpotUseCase.Params, Single<Spot>>() {

    override fun buildUseCaseObservable(params: Params): Single<Spot> {
        return spotRepository.getSpot(params.spot_id)
    }

    data class Params(
        val spot_id: Int
    )
}