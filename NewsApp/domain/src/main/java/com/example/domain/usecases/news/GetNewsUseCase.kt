package com.example.domain.usecases.news

import androidx.paging.PagingData
import com.example.domain.model.Article
import com.example.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetNewsUseCase (
    private val newsRepository: NewsRepository
) {

    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources)
    }

}