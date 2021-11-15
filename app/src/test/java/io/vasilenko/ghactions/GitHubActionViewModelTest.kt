package io.vasilenko.ghactions

import org.junit.Assert.*
import org.junit.Test

class GitHubActionViewModelTest {

    private val gitHubActionViewModel = GitHubActionViewModel()

    @Test
    fun testSum() {
        assertEquals(4, gitHubActionViewModel.sumTwoNumbers(2, 2))
    }
}