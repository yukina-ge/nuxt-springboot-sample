<template>
    <main>
        <div class="bd-lead">
            <section class="container">
                <h1 class="title is-4">ユーザー一覧</h1>
                <section v-if="hasError">Error.</section>
                <section v-else>
                    <div v-if="loading">
                        Loading...
                    </div>
                    <div v-else>
                        <div v-cloak>
                            <article class="media" v-for="user in users" :key="user.id">
                                <figure class="media-left">
                                    <p class="image is-64x64">
                                    <img src="https://placehold.jp/128x128.png">
                                    </p>
                                </figure>
                                <div class="media-content">
                                    <div class="content">
                                    <p>
                                        <strong>
                                            <nuxt-link v-bind:to="{ name : 'users-id', params : { id: user.id.value }}">{{ user.name.value }}</nuxt-link>
                                        </strong>
                                        <small>{{ user.id.value }}</small>
                                    </p>
                                    </div>
                                    <nav class="level is-mobile">
                                        <div class="level-left">
                                            <a class="level-item">
                                            <span class="icon is-small"><i class="fas fa-reply"></i></span>
                                            </a>
                                            <a class="level-item">
                                            <span class="icon is-small"><i class="fas fa-retweet"></i></span>
                                            </a>
                                            <a class="level-item">
                                            <span class="icon is-small"><i class="fas fa-heart"></i></span>
                                            </a>
                                        </div>
                                    </nav>
                                </div>
                            </article>
                        </div>
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
  async asyncData({ app }) {
    const response = await app.$axios.get('/api/users')
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
</script>
