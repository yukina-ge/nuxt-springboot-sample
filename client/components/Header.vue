
<template>
    <header>
        <nav class="navbar is-white has-shadow is-spaced" role="navigation" aria-label="main navigation">
 
          <div class="container">
                <div class="navbar-brand">
                    <a class="navbar-item" href="">
                        <img src="~/assets/images/logo.png">
                    </a>

                    <a role="button" class="navbar-burger burger" aria-label="menu" aria-expanded="false" data-target="mainNavbar">
                        <span aria-hidden="true"></span>
                        <span aria-hidden="true"></span>
                        <span aria-hidden="true"></span>
                    </a>
                </div>

                <div id="mainNavbar" class="navbar-menu">
                    <div class="navbar-start">

                        <a href="/users" class="navbar-item">
                            <span class="has-text-danger">
                                <i class="fas fa-users fa-fw has-text-red" aria-hidden="true"></i>
                            </span>
                            ユーザー
                        </a>

                        <a href="schedule.html" class="navbar-item">
                            <span class="has-text-info">
                                <i class="fas fa-calendar-alt fa-fw" aria-hidden="true"></i>
                            </span>
                            スケジュール
                        </a>

                    </div>

                    <div class="navbar-end">
                        <div class="navbar-item has-dropdown is-hoverable">
                            <a class="navbar-link">
                                <span>
                                    <i class="fas fa-cogs"></i>
                                    システム設定
                                </span>
                            </a>

                            <div class="navbar-dropdown is-right">
                                <a class="navbar-item">
                                    セキュリティ
                                </a>
                                <a class="navbar-item">
                                    通知設定
                                </a>
                                <hr class="navbar-divider">
                                <a class="navbar-item">
                                    ヘルプ
                                </a>
                                <a class="navbar-item">
                                    利用規約
                                </a>
                                <a class="navbar-item">
                                    個人情報保護について
                                </a>
                            </div>
                        </div>
                        <div class="navbar-item has-dropdown is-hoverable">
                            <a class="navbar-link">
                                <span>
                                    <i class="fas fa-user"></i>
                                </span>
                            </a>

                            <div class="navbar-dropdown is-right">
                                <a class="navbar-item">
                                    マイアカウント
                                </a>
                                <a class="navbar-item">
                                    パスワード変更
                                </a>
                                <hr class="navbar-divider">
                                <a class="navbar-item">
                                    ログアウト
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </header>
</template>