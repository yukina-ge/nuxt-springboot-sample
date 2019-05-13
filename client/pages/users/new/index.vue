<template>
    <main>
        <div class="bd-lead">
            <section class="container">
                <h1 class="title is-4">ユーザー作成</h1>
                <section v-if="hasError">Error.</section>
                <section v-else>
                    <div v-if="loading">
                        Loading...
                    </div>
                    <div v-else>
                        <ul v-cloak>
                            <li v-for="user in users" :key="user.id">
                                {{ user.id.value }} : {{ user.name.value }}
                                <nuxt-link v-bind:to="{ name : 'users-id', params : { id: user.id.value }}">詳細</nuxt-link>
                            </li>
                        </ul>
                    </div>
                </section>
            </section>
        </div>
    </main>
</template>

<script>
import MainHeader from '~/components/Header.vue'
import MainFooter from '~/components/Footer.vue'

export default {
  components: {
    MainHeader,
    MainFooter
  },
  data() {
    return {
        hasError: false,
        loading: false,
        users: null
    }
  },
  methods: { 
      async newUser(e) {
        const response = await app.$axios.post('/api/users/new', this.users)
            .catch(function( error ){
                return { 
                    hasError: true
                }
            })
            .finally(function(){
                return { 
                    loading: false
                }
            });
        return { 
            hasError: false,
            loading: false,
            users: response.data.values
        }
    }
  }
}
</script>
