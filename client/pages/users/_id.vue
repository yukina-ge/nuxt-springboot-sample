<template>
    <main>
      <div class="container">
        <h1 class="title is-4">ユーザー詳細</h1>
        <section v-if="hasError">Error.</section>
        <section v-else>
            <div v-if="loading">
            Loading...
            </div>
            <div v-else>
                <ul v-cloak>
                    <li>
                        {{ user.id }} : {{ user.name }}
                    </li>
                </ul>
            </div>
        </section>
      </div>
    </main>
</template>

<script>
export default {
  validate ({ params }) {
    return /^\d+$/.test(params.id)
  },
  data() {
    return {
        hasError: false,
        loading: false,
        user: null
    }
  },
  async asyncData({ app, params }) {
    const response = await app.$axios.get(`/api/users/${params.id}`)
    return {
      user:{
        id: response.data.id.value,
        name: response.data.name.value
      }
    }
  }
}
</script>
